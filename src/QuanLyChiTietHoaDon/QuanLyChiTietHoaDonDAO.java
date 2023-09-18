/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyChiTietHoaDon;

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
public class QuanLyChiTietHoaDonDAO extends mainBUS_DAO.mainDAO{
    
    public QuanLyChiTietHoaDonDAO(){
        super();
        this.tbName = "billdetail";
    }

    @Override
    protected void appendData(List<Object> data, List<String> columns, PreparedStatement stat) throws SQLException {
        if(data != null){
            int count = 1;
            for(String column: columns){
                if("billID".equalsIgnoreCase(column) || "productID".equalsIgnoreCase(column))
                    stat.setString(count, (String) data.get(count - 1));
                else stat.setInt(count, (int) data.get(count - 1));
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
               listColumn.add(rs.getInt(3));
               listColumn.add(rs.getInt(4));
               listColumn.add(rs.getInt(5));
           }
           else {
               int count = 1;
               for(String column : columns){
                   if("billID".equalsIgnoreCase(column) || "productID".equalsIgnoreCase(column))
                        listColumn.add(rs.getString(count));
                    else listColumn.add(rs.getInt(count));
                   count++;
               }
           }
           results.put(String.valueOf(nRecord),listColumn);
           nRecord++;
       }
    }
    
    public ArrayList<ChiTietHoaDon> readDB(){
        ArrayList<ChiTietHoaDon> dscthd = new ArrayList<>();
        try {
            ResultSet rs = this.getResult();
              while(rs.next()){
                  dscthd.add(new ChiTietHoaDon(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getInt(5)));
              }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return dscthd;
    }
}
