package datalab.upo.ladonspark.model;
// Generated 07-jun-2018 9:12:05 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Algorithm generated by hbm2java
 */
/*
* This file is part of LadonSpark.

* LadonSpark is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.

* LadonSpark is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.

* You should have received a copy of the GNU General Public License
* along with LadonSpark.  If not, see <https://www.gnu.org/licenses/>.
*/
public class Algorithm  implements java.io.Serializable {


     private Integer idAlg;
     private String nameAlg;
     private String urlAlg;
     private String class_;
     private Set parameters = new HashSet(0);

    public Algorithm() {
    }

	
    public Algorithm(String nameAlg, String urlAlg, String class_) {
        this.nameAlg = nameAlg;
        this.urlAlg = urlAlg;
        this.class_ = class_;
    }
    public Algorithm(String nameAlg, String urlAlg, String class_, Set parameters) {
       this.nameAlg = nameAlg;
       this.urlAlg = urlAlg;
       this.class_ = class_;
       this.parameters = parameters;
    }
   
    public Integer getIdAlg() {
        return this.idAlg;
    }
    
    public void setIdAlg(Integer idAlg) {
        this.idAlg = idAlg;
    }
    public String getNameAlg() {
        return this.nameAlg;
    }
    
    public void setNameAlg(String nameAlg) {
        this.nameAlg = nameAlg;
    }
    public String getUrlAlg() {
        return this.urlAlg;
    }
    
    public void setUrlAlg(String urlAlg) {
        this.urlAlg = urlAlg;
    }
    public String getClass_() {
        return this.class_;
    }
    
    public void setClass_(String class_) {
        this.class_ = class_;
    }
    public Set getParameters() {
        return this.parameters;
    }
    
    public void setParameters(Set parameters) {
        this.parameters = parameters;
    }




}


