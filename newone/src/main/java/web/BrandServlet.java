package web;



import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pojo.Brand;

import java.io.BufferedReader;
import java.io.IOException;








public class BrandServlet {
//    public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        //1. 接收品牌数据
//        BufferedReader br = request.getReader();
//        String params = br.readLine();//json字符串
//
//  b      //转为Brand对象
//        Brand brand = JSON.parseObject(params, Brand.class);
//
//        //2. 调用service添加
//        brandService.add(brand);
//
//        //3. 响应成功的标识
//        response.getWriter().write("success");
//    }
//
//    public void deleteByIds(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        //1. 接收数据  [1,2,3]
//        BufferedReader br = request.getReader();
//        String params = br.readLine();//json字符串
//
//        //转为 int[]
//        int[] ids = JSON.pbarseObject(params, int[].class);
//
//        //2. 调用service添加
//        brandService.deleteByIds(ids);
//
//        //3. 响应成功的标识
//        response.getWriter().write("success");
//   b }
}