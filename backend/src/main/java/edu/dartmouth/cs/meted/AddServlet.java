package edu.dartmouth.cs.meted;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.dartmouth.cs.meted.data.ParkingSpot;
import edu.dartmouth.cs.meted.data.ParkingSpotDatastore;

/**
 * Created by JaySha on 4/15/16.
 */
public class AddServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws IOException, ServletException {
        
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp)
        throws IOException, ServletException {
        doGet(req, resp);
    }
}
