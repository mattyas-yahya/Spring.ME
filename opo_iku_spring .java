/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spring_e_matt;

/**
 *
 * @author matt
 */
public class opo_iku_spring 
{
    private String dataku;

    /**
     * @return the dataku
     */
    public String getDataku() {
        return dataku;
    }

    /**
     * @param dataku the dataku to set
     */
    public void setDataku(String dataku)
    {
        this.dataku = dataku;
    }
     public void Data()
    {
        System.out.println(getDataku().toLowerCase());
    }
}
