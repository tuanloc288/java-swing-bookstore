
package QuanLySanPham;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class QuanLySanPhamDAO extends mainBUS_DAO.mainDAO{

    public QuanLySanPhamDAO(){
        super();
        this.tbName = "product";
    }
    
    @Override
    protected void appendData(List<Object> data, List<String> columns, PreparedStatement stat) throws SQLException {
        if(data != null){
            int count = 1;
            for(String column : columns){
                if("discount".equalsIgnoreCase(column))
                    stat.setFloat(count, (Float) data.get(count - 1));
                else if("stock".equalsIgnoreCase(column) || "price".equalsIgnoreCase(column) || "pages".equalsIgnoreCase(column))
                    stat.setInt(count, (int) data.get(count - 1));
                else stat.setString(count, (String) data.get(count - 1));
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
                listColumn.add(rs.getString(5));
                listColumn.add(rs.getString(6));
                listColumn.add(rs.getString(7));
                listColumn.add(rs.getString(8));
                listColumn.add(rs.getFloat(9));
                listColumn.add(rs.getString(10));
                listColumn.add(rs.getInt(11));
                listColumn.add(rs.getString(12));
                listColumn.add(rs.getInt(13));
                listColumn.add(rs.getInt(14));
                listColumn.add(rs.getString(15));
                listColumn.add(rs.getString(16));
            }
            else {
                int count = 1;
                for(String column : columns){
                    if("discount".equalsIgnoreCase(column))
                        listColumn.add(rs.getFloat(count));
                    else if("stock".equalsIgnoreCase(column) || "price".equalsIgnoreCase(column) || "pages".equalsIgnoreCase(column))
                        listColumn.add(rs.getInt(count));
                    else listColumn.add(rs.getString(count));
                    count++;
                }
            }
            
            results.put(String.valueOf(nRecord), listColumn);
            nRecord++;
        }
    }
    
    public ArrayList<SanPham> readDB(){
        ArrayList<SanPham> dssp = new ArrayList<>();
        try {
            ResultSet rs = this.getResult();
              while(rs.next()){
                  dssp.add(new SanPham(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),
                          rs.getString(6),rs.getString(7),rs.getString(8),Float.parseFloat(rs.getString(9)),rs.getString(10),rs.getInt(11),rs.getString(12),
                          rs.getInt(13),rs.getInt(14),rs.getString(15),rs.getString(16)));
              }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return dssp;
    }
}
