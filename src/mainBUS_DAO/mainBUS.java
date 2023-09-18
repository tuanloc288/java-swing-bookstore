/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainBUS_DAO;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class mainBUS {
    protected mainDAO DAO;
    
    public mainBUS(){
        this.DAO = null;
    }
    
   public int selectData(List<Object> dataSet , List<String> dataColumns, List<String> selectedColumns, Map<String, List<Object>> results, boolean distinct){
       return this.DAO.selectData(dataSet, dataColumns, selectedColumns, results,distinct);
   }
   
   public int insertData(List<Object> dataSet , List<String> columns){
       return this.DAO.insertData(dataSet, columns);
   }
   
   public int  updateData(List<Object> dataSet, List<String> updateColumns , List<String> conditionColumns){
       return this.DAO.updateData(dataSet, updateColumns, conditionColumns);
   }
   
   public int deleteData(List<Object> conditionData , List<String> conditionColumns){
       return this.DAO.deleteData(conditionData, conditionColumns);
   }
   
}
