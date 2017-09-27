/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package test;
import oracle.jbo.server.ApplicationModuleImpl;
//  ---------------------------------------------------------------
//  ---    File generated by Oracle Business Components for Java.
//  ---------------------------------------------------------------

public class TestModuleImpl extends ApplicationModuleImpl  {
  /**
   * 
   * This is the default constructor (do not remove)
   */
  public TestModuleImpl() {
  }

  /**
   * 
   * Container's getter for DeptView1
   */
  public DeptViewImpl getDeptView1() {
    return (DeptViewImpl)findViewObject("DeptView1");
  }

  /**
   * 
   * Sample main for debugging Business Components code using the tester.
   */
  public static void main(String[] args) {
    launchTester("test", "TestModuleLocal");
  }
}