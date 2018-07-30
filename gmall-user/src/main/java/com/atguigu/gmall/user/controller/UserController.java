package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.bean.UserInfo;
import com.atguigu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("userInfoList")
    public ResponseEntity<List<UserInfo>> userInfoList(){

        List<UserInfo> userInfoList = userService.userInfoList();

        return ResponseEntity.ok(userInfoList);
    }

    @RequestMapping("userInfo")
    public ResponseEntity<UserInfo> queryUserInfo(String id){

        UserInfo userInfo = userService.queryUserInfo(id);

        return ResponseEntity.ok(userInfo);
    }

    @RequestMapping("updateUserInfo")
    public ResponseEntity<Integer> updateUserInfo(UserInfo userInfo){
        Integer result = userService.updateUserInfo(userInfo);
        return ResponseEntity.ok(result);
    }

    @RequestMapping("deleteUserInfo")
    public ResponseEntity<Integer> deleteUserInfo(String id){
        Integer result = userService.deleteUserInfo(id);
        return ResponseEntity.ok(result);
    }

    @RequestMapping("addUserInfo")
    public ResponseEntity<Integer> addUserInfo(UserInfo userInfo){
        Integer result = userService.addUserInfo(userInfo);
        return ResponseEntity.ok(result);
    }

    @RequestMapping("userAddressList")
    public ResponseEntity<List<UserAddress>> userAddressList(){
        List<UserAddress> userAddressList = userService.userAddressList();
        return ResponseEntity.ok(userAddressList);
    }

    @RequestMapping("getUserAddressByUserId")
    public ResponseEntity<List<UserAddress>> getUserAddressByUserId(String userId){
        List<UserAddress> userAddressList = userService.getUserAddressByUserId(userId);
        return ResponseEntity.ok(userAddressList);
    }

    @RequestMapping("addUserAddress")
    public ResponseEntity<Integer> addUserAddress(UserAddress userAddress){
        Integer result = userService.addUserAddress(userAddress);
        return ResponseEntity.ok(result);
    }

    @RequestMapping("updateUserAddress")
    public ResponseEntity<Integer> updateUserAddress(UserAddress userAddress){
        Integer result = userService.updateUserAddress(userAddress);
        return ResponseEntity.ok(result);
    }

    @RequestMapping("deleteUserAddress")
    public ResponseEntity<Integer> deleteUserAddress(String id){
        Integer result = userService.deleteUserAddress(id);
        return ResponseEntity.ok(result);
    }
}
