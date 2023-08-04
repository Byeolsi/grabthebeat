//package com.ygd.grab_the_beat.controller;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@CrossOrigin(origins = "*")
//@RestController
//@RequestMapping("call")
//public class CallController {
//    // 무조건 거짓으로 하면 클래스 자체가 필요없어 보임
//
//    @Value("${CALL_PRIVATE_ACCESS}")
//    private String CALL_PRIVATE_ACCESS;
//
//    @GetMapping("/config")
//    public ResponseEntity<?> getConfig() {
//        // private access 여부를 반환
//
//        Map<String, Object> response = new HashMap<String, Object>();
//
//        response.put("isPrivate", CALL_PRIVATE_ACCESS.equals("ENABLED"));
//
//        return new ResponseEntity<>(response, HttpStatus.OK);
//    }
//}
