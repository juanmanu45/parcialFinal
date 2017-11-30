/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Conexion.DbUtil;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import vo.Consulta;

/**
 *
 * @author Juan Manuel
 */
public class CrudColmenas {
    
    private Connection connection;

    public CrudColmenas() throws URISyntaxException {
        connection = DbUtil.getConnection();
    }

    
    
      public List<Consulta> mostarFacturas() {
        List<Consulta> facs = new ArrayList<Consulta>();
        try {
            System.out.println("LLegue hasta aca");
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("select  recoleccion.cantidadKilos,colmena.idColmena,municipio.nombre from colmena inner join recoleccion natural join municipio where recoleccion.cantidadKilos>2 order by recoleccion.cantidadKilos");
            while (rs.next()) {
                
               Consulta c= new Consulta();
               c.setIdColmena(rs.getInt("idColmena"));
               c.setKilos(rs.getInt("cantidadKilos"));
               c.setMunicipio(rs.getString("nombre"));
               
               
               facs.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return facs;
    }
    
    
}
