package QuanLyNhanVien;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;



public class QuanLyNhanVienBUS extends mainBUS_DAO.mainBUS{
    public ArrayList<NhanVien> dsnv = new ArrayList<>();
    QuanLyNhanVienDAO qlnvDAO = new QuanLyNhanVienDAO();
    
    public QuanLyNhanVienBUS(){
        this.DAO = new QuanLyNhanVienDAO();
        this.dsnv = qlnvDAO.readDB();
    }
    
    public List<String> getColumns(){
        List<String> columns = new LinkedList<>();
        columns.add("employeeID");
        columns.add("name");
        columns.add("dob");
        columns.add("address");
        columns.add("phone");
        return columns;
    }
    
    public void readDB(){
        this.dsnv.clear();
        this.dsnv = qlnvDAO.readDB();
    }
    
    public ArrayList<NhanVien> getDSNV(){
        return this.dsnv;
    }
    
    public int Add(List<Object> data , List<String> column){
        int flag = qlnvDAO.insertData(data, column);
        readDB();
        return flag;
    }
    
    public int Update(List<Object> dataSet , List<String> updateColumns , List<String> conditionColumns){
        int flag = qlnvDAO.updateData(dataSet, updateColumns, conditionColumns);
        readDB();
        return flag;
    }
    
    public int Delete(List<Object> conditionData, List<String> conditionColumns){
        int flag = qlnvDAO.deleteData(conditionData, conditionColumns);
        readDB();
        return flag;
    }
    
    public String getSingleData(List<Object> dataSet, List<String> dataColumns, List<String> selectedColumns,boolean distinct) {
        String searchData = "";
        Map<String, List<Object>> rs = new HashMap<>();
        int temp = qlnvDAO.selectData(dataSet, dataColumns, selectedColumns, rs,distinct);
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
