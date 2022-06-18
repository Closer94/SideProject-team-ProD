package com.example.demo.member.mapper;


import java.util.List;

import com.example.demo.member.vo.MemberVO;
import com.example.demo.security.vo.UserVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {


  int save(MemberVO memberVO);

  int chgPass(MemberVO memberVO);


}