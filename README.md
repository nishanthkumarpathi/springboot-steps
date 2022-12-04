

31. Create Employee POST methods in JPA

Here we are going to write two Implementations for the EmployeeService.

* EmployeeServiceImpl.java
* EmployeeV2ServiceImpl.java

After Implementing them both "Employee Controller", will not which one to call.

There will be two Beans.

    @Autowired
    private EmployeeService employeeService;

You can use Qualifier Annotations.

----------------------------

At the time of execution, you can go to H2 Console and see the data.

    http://localhost:8080/h2-console

* Perform the post method and check the data in the H2 Console.

