/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyTheLoai;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class QuanLyTheLoaiBUS extends mainBUS_DAO.mainBUS {
    public ArrayList<TheLoai> dslsp = new ArrayList<>();
    QuanLyTheLoaiDAO qllspDAO = new QuanLyTheLoaiDAO();

    public QuanLyTheLoaiBUS() {
        this.DAO = new QuanLyTheLoaiDAO();
        this.dslsp = qllspDAO.readDB();
    }

    public void showAll() {
        for(TheLoai tl: dslsp){
            System.out.println("Category id: " + tl.getMaTL());
            System.out.println("Name: " + tl.getTenTL());
        }
    }
    
    public List<String> getColumns(){
        List<String> column = new LinkedList<>();
        column.add("categoryID");
        column.add("name");
        return column;
    }

    public int Add(List<Object> data , List<String> column){
        int flag = qllspDAO.insertData(data, column);
        readDB();
        return flag;
    }
    
    public int Update(List<Object> dataSet , List<String> updateColumns , List<String> conditionColumns){
        int flag = qllspDAO.updateData(dataSet, updateColumns, conditionColumns);
        readDB();
        return flag;
    }
    
    public int Delete(List<Object> conditionData, List<String> conditionColumns){
        int flag = qllspDAO.deleteData(conditionData, conditionColumns);
        readDB();
        return flag;
    }
    
    public String getSingleData(List<Object> dataSet, List<String> dataColumns, List<String> selectedColumns,boolean distinct) {
        String searchData = "";
        Map<String, List<Object>> rs = new HashMap<>();
        int temp = qllspDAO.selectData(dataSet, dataColumns, selectedColumns, rs, distinct);
        if(temp == 1){
            if(!rs.isEmpty()){
                for(String key : rs.keySet()){
                    List<Object> records = rs.get(key);
                    for(Object record: records){
                        searchData = String.valueOf(record);
                    }
                }
            }
            return searchData;
        }
        else if(temp == 2){
            return "2";
        }
        else return "0";
    }
    
    public ArrayList<TheLoai> getDSTL(){
        return this.dslsp;
    }
    
    public void readDB(){
        this.dslsp.clear();
        this.dslsp = qllspDAO.readDB(); 
    }
}
