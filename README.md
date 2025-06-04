# Wave Rover backend website for mission and control planner GUI (Command Service)
The idea is this should run on the control station laptop with its frontend and be transmitted to the wave rover over WIFI, 4G/5G, or an IP radio. 

The backend runs a web server, it holds the databases, it also recieves HTTP requests from the frontend or sends them to the frontend to recieve and display data on the frontend or store data in its database
or to send commands to the ROS2 robot over HTTP from the GUI buttons the user has clicked on the frontend.

This backend is made with Spring Boot. 
