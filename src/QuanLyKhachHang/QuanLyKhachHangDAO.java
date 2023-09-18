package QuanLyKhachHang;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class QuanLyKhachHangDAO extends mainBUS_DAO.mainDAO{

    public QuanLyKhachHangDAO(){
        super();
        this.tbName = "customer";
    }
    
    @Override
    protected void appendData(List<Object> data, List<String> columns, PreparedStatement stat) throws SQLException {
        if(data != null){
            int count = 1;
            for(String column: columns){
                stat.setString(count, (String) data.get(count - 1));
                count++;
            }
        }
    }

    @Override
    protected void mappingData(ResultSet rs, List<String> columns, Map<String, List<Object>> results) throws SQLException {
       int nRecord = 1;
       while(rs.next()){
           List<Object> listColumn = new LinkedList<>();
           if(columns == null){
               listColumn.add(rs.getString(1));
               listColumn.add(rs.getString(2));
               listColumn.add(rs.getString(3));
               listColumn.add(rs.getString(4));
           }
           else {
               int count = 1;
               for(String column : columns){
                   listColumn.add(rs.getString(count));
                   count++;
               }
           }
           results.put(String.valueOf(nRecord),listColumn);
           nRecord++;
       }
    }
    
    public ArrayList<KhachHang> readDB(){
        ArrayList<KhachHang> dskh = new ArrayList<>();
        try {
            ResultSet rs = this.getResult();
              while(rs.next()){
                  dskh.add(new KhachHang(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
              }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return dskh;
    }
}
