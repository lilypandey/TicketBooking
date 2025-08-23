package org.example.entities;

import java.util.Date;

public class Ticket {
    private String ticketId;
    private String userId;
    private String source;
    private String destination;
    private Date DateOfTravel;
    private Train train;

    public Ticket(String ticketId, String userId, String source, String destination, Date DateOfTravel, Train train){
        this.ticketId = ticketId;
        this.userId = userId;
        this.source = source;
        this.destination = destination;
        this.DateOfTravel = DateOfTravel;
        this.train = train;
    }
    public Ticket(){}


}
