/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package spring_e_matt;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 *
 * @author matt
 */
public class Spring_e_matt 
{

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) 
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_e_matt/newSpringXMLConfig.xml");
        opo_iku_spring  opo_iku = (opo_iku_spring ) applicationContext.getBean("opo_iku_spring");
        opo_iku.Data();
    }
}
