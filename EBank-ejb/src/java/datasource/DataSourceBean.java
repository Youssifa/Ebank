package datasource;
import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DG
 */
@Singleton
@Startup
@DataSourceDefinition(name="java:global/jdbc/myDataSource",
    className="com.mysql.cj.jdbc.Driver",
    url="jdbc:mysql://localhost:3306/ebankdb",
    user="ebankadmin",
    password="ebank_admin"
)
public class DataSourceBean {
}
