/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package model;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.domain.Number;
import oracle.jbo.RowIterator;
import oracle.jbo.Key;
//  ---------------------------------------------------------------------
//  ---    File generated by Oracle ADF Business Components Design Time.
//  ---    Custom code may be added to this class.
//  ---    Warning: Do not modify method signatures of generated methods.
//  ---------------------------------------------------------------------

public class DepartmentsImpl extends EntityImpl  {
  public static final int DEPARTMENTID = 0;
  public static final int DEPARTMENTNAME = 1;
  public static final int MANAGERID = 2;
  public static final int LOCATIONID = 3;
  public static final int DEPARTMENTMANAGER = 4;
  public static final int EMPLOYEES = 5;
  public static final int JOBHISTORY = 6;





  private static EntityDefImpl mDefinitionObject;

  /**
   * 
   *  This is the default constructor (do not remove)
   */
  public DepartmentsImpl() {
  }

  /**
   * 
   *  Retrieves the definition object for this instance class.
   */
  public static synchronized EntityDefImpl getDefinitionObject() {
    if (mDefinitionObject == null) {
      mDefinitionObject = (EntityDefImpl)EntityDefImpl.findDefObject("model.Departments");
    }
    return mDefinitionObject;
  }






  /**
   * 
   *  Gets the attribute value for DepartmentId, using the alias name DepartmentId
   */
  public Number getDepartmentId() {
    return (Number)getAttributeInternal(DEPARTMENTID);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for DepartmentId
   */
  public void setDepartmentId(Number value) {
    setAttributeInternal(DEPARTMENTID, value);
  }

  /**
   * 
   *  Gets the attribute value for DepartmentName, using the alias name DepartmentName
   */
  public String getDepartmentName() {
    return (String)getAttributeInternal(DEPARTMENTNAME);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for DepartmentName
   */
  public void setDepartmentName(String value) {
    setAttributeInternal(DEPARTMENTNAME, value);
  }

  /**
   * 
   *  Gets the attribute value for ManagerId, using the alias name ManagerId
   */
  public Number getManagerId() {
    return (Number)getAttributeInternal(MANAGERID);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for ManagerId
   */
  public void setManagerId(Number value) {
    setAttributeInternal(MANAGERID, value);
  }

  /**
   * 
   *  Gets the attribute value for LocationId, using the alias name LocationId
   */
  public Number getLocationId() {
    return (Number)getAttributeInternal(LOCATIONID);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for LocationId
   */
  public void setLocationId(Number value) {
    setAttributeInternal(LOCATIONID, value);
  }

  /**
   * 
   *  getAttrInvokeAccessor: generated method. Do not modify.
   */
  protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception {
    switch (index)
      {
      case DEPARTMENTID:
        return getDepartmentId();
      case DEPARTMENTNAME:
        return getDepartmentName();
      case MANAGERID:
        return getManagerId();
      case LOCATIONID:
        return getLocationId();
      case EMPLOYEES:
        return getEmployees();
      case JOBHISTORY:
        return getJobHistory();
      case DEPARTMENTMANAGER:
        return getDepartmentManager();
      default:
        return super.getAttrInvokeAccessor(index, attrDef);
      }
  }

  /**
   * 
   *  setAttrInvokeAccessor: generated method. Do not modify.
   */
  protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception {
    switch (index)
      {
      case DEPARTMENTID:
        setDepartmentId((Number)value);
        return;
      case DEPARTMENTNAME:
        setDepartmentName((String)value);
        return;
      case MANAGERID:
        setManagerId((Number)value);
        return;
      case LOCATIONID:
        setLocationId((Number)value);
        return;
      default:
        super.setAttrInvokeAccessor(index, value, attrDef);
        return;
      }
  }



  /**
   * 
   *  Gets the associated entity oracle.jbo.RowIterator
   */
  public RowIterator getEmployees() {
    return (RowIterator)getAttributeInternal(EMPLOYEES);
  }


  /**
   * 
   *  Gets the associated entity EmployeesImpl
   */
  public EmployeesImpl getDepartmentManager() {
    return (EmployeesImpl)getAttributeInternal(DEPARTMENTMANAGER);
  }

  /**
   * 
   *  Sets <code>value</code> as the associated entity EmployeesImpl
   */
  public void setDepartmentManager(EmployeesImpl value) {
    setAttributeInternal(DEPARTMENTMANAGER, value);
  }


  /**
   * 
   *  Gets the associated entity oracle.jbo.RowIterator
   */
  public RowIterator getJobHistory() {
    return (RowIterator)getAttributeInternal(JOBHISTORY);
  }

  /**
   * 
   *  Creates a Key object based on given key constituents
   */
  public static Key createPrimaryKey(Number departmentId) {
    return new Key(new Object[] {departmentId});
  }




}
