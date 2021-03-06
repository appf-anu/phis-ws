//**********************************************************************************************
//                                       Call.java
// SILEX-PHIS
// Copyright © INRA 2018
// Contact: alice.boizet@inra.fr, anne.tireau@inra.fr, pascal.neveu@inra.fr
//***********************************************************************************************

package phis2ws.service.view.model.phis;

import java.util.ArrayList;

/**
 * Represents a call
 * @author Alice Boizet <alice.boizet@inra.fr>
 */
public class Call {
    private String call;
    private ArrayList<String> datatypes = new ArrayList<>();
    private ArrayList<String> methods = new ArrayList<>();
    private ArrayList<String> versions = new ArrayList<>();

    //Default constructor
    public Call() {
        
    }    

    //Constructor with param
    public Call(String call, ArrayList<String> datatypes, ArrayList<String> methods, ArrayList<String> versions) {
        this.call = call;
        this.datatypes = datatypes;
        this.methods = methods;
        this.versions = versions;
    }


    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public ArrayList<String> getDatatypes() {
        return datatypes;
    }

    public void setDatatypes(ArrayList<String> datatypes) {
        this.datatypes = datatypes;
    }

    public ArrayList<String> getMethods() {
        return methods;
    }

    public void setMethods(ArrayList<String> methods) {
        this.methods = methods;
    }

    public ArrayList<String> getVersions() {
        return versions;
    }

    public void setVersions(ArrayList<String> versions) {
        this.versions = versions;
    }
}
