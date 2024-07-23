# Quad B - Technical Assignment

**Quad B** is an Android application developed as part of a technical assignment for an Android development internship/job application. This application showcases a list of movies fetched from an API and displays detailed information about each movie. The app is built using Java and XML.

## Table of Contents

- [Features](#features)
- [Screenshots](#screenshots)
- [Installation](#installation)
- [Usage](#usage)
- [License](#license)

## Features

- **Splash Screen**: A splash screen with a fade transition effect.
- **Search Functionality**: Users can search for movies using keywords.
- **Movie List**: Displays a list of movies with their titles and summaries.
- **Movie Details**: Shows detailed information about the selected movie, including the title, summary, network, and premiere date.
- **Smooth Transitions**: Smooth scroll transitions in the RecyclerView.

## Screenshots📷
<table>
  <tr>
    <td>splash Screen </td>
     <td>Home screen  </td>
     <td>detail screen</td>
     <td>search screen</td>
     
    
  </tr>
  <tr>
    <td><img src="https://github.com/Vishallab/Quad-B/blob/master/splash%20scrreen.jpeg" width=240 height=410/></td>
    <td><img src="https://github.com/Vishallab/Quad-B/blob/master/home%20screen.jpeg" width=240 height=410/></td>
    <td><img src="https://github.com/Vishallab/Quad-B/blob/master/detail%20screen.jpeg" width=240 height=410/></td>
    <td><img src="https://github.com/Vishallab/Quad-B/blob/master/searc%20screen.jpeg" width=240 height=410/></td>
    
    
  </tr>
  


 </table>

<br>


https://github.com/user-attachments/assets/f75b3e48-52cf-4ab1-8daa-f4d1bbd5bc24




## Code Overview

### Main Components

- **SplashActivity**: Displays the splash screen with a fade transition.
- **MainActivity**: Fetches movie data from the API and displays it in a RecyclerView.
- **DetailsActivity**: Displays detailed information about the selected movie.

### API Integration

The app fetches movie data from the TVMaze API. The network request is handled using OkHttp, and the JSON response is parsed using Gson.

### Data Models

- **Show**: Represents a movie/show with properties like name, summary, image, network, and premiered date.

### Adapter

- **MoviesAdapter**: Binds movie data to the RecyclerView.





## Developed by 
 ### 😎 Vishal Mishra

## Social Media
Connect with me:
- [LinkedIn](https://www.linkedin.com/in/vishalmishra01)
- [Instagram](https://www.instagram.com/ig_viishal)
- [GitHub](https://www.github.com/Vishallab)
