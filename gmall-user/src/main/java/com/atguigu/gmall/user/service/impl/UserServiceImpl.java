package com.atguigu.gmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.bean.UserInfo;
import com.atguigu.gmall.service.UserService;
import com.atguigu.gmall.user.mapper.UserAddressMapper;
import com.atguigu.gmall.user.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserInfoMapper userInfoMapper;

    @Autowired
    UserAddressMapper userAddressMapper;

    @Override
    public List<UserInfo> userInfoList() {
        return userInfoMapper.selectAll();
    }

    @Override
    public UserInfo queryUserInfo(String id) {
        return userInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer updateUserInfo(UserInfo userInfo) {

        return userInfoMapper.updateByPrimaryKey(userInfo);
    }

    @Override
    public Integer deleteUserInfo(String id) {
        return userInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer addUserInfo(UserInfo userInfo) {
        return userInfoMapper.insert(userInfo);
    }

    @Override
    public List<UserAddress> userAddressList() {
        return userAddressMapper.selectAll();
    }

    @Override
    public List<UserAddress> getUserAddressByUserId(String userId) {
        UserAddress userAddress = new UserAddress();
        userAddress.setUserId(userId);
        return userAddressMapper.select(userAddress);
    }

    @Override
    public Integer addUserAddress(UserAddress userAddress) {
        return userAddressMapper.insert(userAddress);
    }

    @Override
    public Integer updateUserAddress(UserAddress userAddress) {
        return userAddressMapper.updateByPrimaryKey(userAddress);
    }

    @Override
    public Integer deleteUserAddress(String id) {
        return userAddressMapper.deleteByPrimaryKey(id);
    }


}
