/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author YOGESH
 */
@WebService(serviceName = "MyWebService")
public class MyWebService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "SignUp")
    public String SignUp() {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * This is a sample web service operation
     */
        
}
