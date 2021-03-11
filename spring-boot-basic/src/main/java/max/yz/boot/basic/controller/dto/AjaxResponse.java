package max.yz.boot.basic.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author imyizai
 * @ClassName AjaxResponse
 * @Description: 统一响应结果封装
 * @Date 2021/3/11 7:39 下午
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AjaxResponse {
   private  Integer code;
   private  String message;
   private  Object data;

   public static AjaxResponse success() {
       AjaxResponse ajaxResponse = new AjaxResponse();
       ajaxResponse.setCode(200);
       ajaxResponse.setMessage("请求成功");
       return ajaxResponse;
   }
    public static AjaxResponse success(Object obj) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求成功");
        ajaxResponse.setData(obj);
        return ajaxResponse;
    }
}
