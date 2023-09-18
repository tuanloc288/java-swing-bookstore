package QuanLyHoaDon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class QuanLyHoaDonBUS extends mainBUS_DAO.mainBUS{
    public ArrayList<HoaDon> dshd = new ArrayList<>();
    QuanLyHoaDonDAO qlhdDAO = new QuanLyHoaDonDAO();
    
    public QuanLyHoaDonBUS(){
        this.DAO = new QuanLyHoaDonDAO();
        this.dshd = qlhdDAO.readDB();
    }
    
    public void readDB(){
        this.dshd.clear();
        this.dshd = qlhdDAO.readDB();
    }
    
    public List<String> getColumns(){
        List<String> columns = new LinkedList<>();
        columns.add("billID");
        columns.add("employeeID");
        columns.add("customerID");
        columns.add("date");
        columns.add("time");
        columns.add("total");
        return columns;
    }
    
    public ArrayList<HoaDon> getDSHD(){
        return this.dshd;
    }
    
    public int Add(List<Object> data , List<String> column){
        int flag = qlhdDAO.insertData(data, column);
        readDB();
        return flag;
    }
    
    public int Update(List<Object> dataSet , List<String> updateColumns , List<String> conditionColumns){
        int flag = qlhdDAO.updateData(dataSet, updateColumns, conditionColumns);
        readDB();
        return flag;
    }
    
    public int Delete(List<Object> conditionData, List<String> conditionColumns){
        int flag = qlhdDAO.deleteData(conditionData, conditionColumns);
        readDB();
        return flag;
    }
    
    public String getSingleData(List<Object> dataSet, List<String> dataColumns, List<String> selectedColumns,boolean distinct) {
        String searchData = "";
        Map<String, List<Object>> rs = new HashMap<>();
        int temp = qlhdDAO.selectData(dataSet, dataColumns, selectedColumns, rs,distinct);
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
}
