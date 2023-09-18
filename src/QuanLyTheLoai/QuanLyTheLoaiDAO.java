/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyTheLoai;

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
public class QuanLyTheLoaiDAO extends mainBUS_DAO.mainDAO{

    public QuanLyTheLoaiDAO(){
        super();
        this.tbName = "category";
    }
    
    @Override
    protected void appendData(List<Object> data, List<String> columns, PreparedStatement stat) throws SQLException  {
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
    
    public ArrayList<TheLoai> readDB(){
        ArrayList<TheLoai> dslsp = new ArrayList<>();
        
        try {
              ResultSet rs = this.getResult();
              while(rs.next()){
                  dslsp.add(new TheLoai(rs.getString(1),rs.getString(2)));
              }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
        return dslsp;
    }
}
