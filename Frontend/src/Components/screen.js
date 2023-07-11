import React, { useState } from 'react';
import AppBar from './AppBar';
import AppBarOptionsDescription from './AppBarOptionsDescriptions';
import Carousel from './Carousel';
import './../CSS/Screen.css'
import MoviesDisplay from './MoviesDisplay';

export default function Screen(){
    const [activeScreen,setActiveScreen]=useState("Home")
    const dataFromAppBar=(data)=>{
        setActiveScreen(data)
    }
    
    const carouselData=[
        "Sign up Today and get 50% off on your First Booking.",
        "Free Pop Corn and Drink on your Firstever Booking.",
        "Go Premiere & Bask in $5 Bonus Bucks"
    ]
    switch(activeScreen){
        case "Home":
            return(
                <div className='ScreenContainer'>
                    <AppBar dataFromAppBar={dataFromAppBar}/>
                    <Carousel carouselData={carouselData}/>
                    <MoviesDisplay />
                </div>
            );
            break;
        default:
            return(
                <div className='ScreenContainer'>
                <AppBar dataFromAppBar={dataFromAppBar}/>
                <Carousel carouselData={carouselData}/>
                <AppBarOptionsDescription activeScreen={activeScreen} dataFromAppBar={dataFromAppBar}/>
                <MoviesDisplay />
                </div>
            );
    }
}
