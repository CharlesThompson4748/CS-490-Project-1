/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

public interface Searchable {
    //Interface functions
    public boolean contains(String key);
    public boolean matches(String ID);
    public String[] info();
}
