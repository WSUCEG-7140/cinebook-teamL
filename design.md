Design
CineBook is a web application designed to facilitate the booking of movie tickets. It provides a user-friendly interface for users to browse available movies, view movie details, book tickets, make payments, and log out. Additionally, it offers administrative functionality for managing movies.
@section Project Project Overview


Features
https://github.com/WSUCEG-7140/cinebook-teamL/tree/main
Installation
Clone the repository
run the backend server
run the React application
connet via localhost:3000
cinebook-teamL Backend

This folder contains the files related to the Spring backend server with APIs exposed to perform several actions. The main contents are as follows:

Model:

Movies: The database for Movies.
Theater: The database for Theaters.
Tickets: The database for the booked tickets.
User: The database for user details.
Controller:

MovieAPIS: APIs for managing the Movies database.
TheaterAPIS: APIs for the Theater actions.
TicketsAPIS: APIs for managing the Tickets.
UserApIS: APIs to handle user functions.
Configuration:

AppSecurityConfig: Configuration to manage Spring security.
SwaggerConfig: Configuration for Swagger to test the exposed APIs.
Service:

It contains the services that the APIs would perform.


Frontend:

This folder has all the necessary files required for the frontend application of Cinebook-teamL.

Components: This folder has all the necessary components required for the react application.

CSS: This folder has the .css file ti the style the components

App.js ithe main page where the react application starts.
