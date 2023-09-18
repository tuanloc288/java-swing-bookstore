/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyHoaDon;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class QuanLyHoaDonDAO extends mainBUS_DAO.mainDAO{

    public QuanLyHoaDonDAO(){
        super();
        this.tbName = "bill";
    }
    
    @Override
    protected void appendData(List<Object> data, List<String> columns, PreparedStatement stat) throws SQLException {
        if(data != null){
            int count = 1;
            for(String column: columns){
                if("total".equalsIgnoreCase(column))
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
               listColumn.add(rs.getInt(6));
           }
           else {
               int count = 1;
               for(String column : columns){
                   if("total".equalsIgnoreCase(column))
                        listColumn.add(rs.getInt(count));
                    else listColumn.add(rs.getString(count));
                   count++;
               }
           }
           results.put(String.valueOf(nRecord),listColumn);
           nRecord++;
       }
    }
    
    public ArrayList<HoaDon> readDB(){
        ArrayList<HoaDon> dshd = new ArrayList<>();
        try {
            ResultSet rs = this.getResult();
              while(rs.next()){
                  dshd.add(new HoaDon(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6)));
              }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return dshd;
    }
}
