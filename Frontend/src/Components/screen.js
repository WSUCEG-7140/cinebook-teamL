import React, { useState } from 'react';
import AppBar from './AppBar';
import AppBarOptionsDescription from './AppBarOptionsDescriptions';
import Carousel from './Carousel';
import './../CSS/Screen.css'
import MoviesDisplay from './MoviesDisplay';
import Book from './Book';
import Signup from './Signup';

export default function Screen(){
    const [activeScreen,setActiveScreen]=useState("Home")
    const [movieBookData,setmovieBookData]=useState("")
    const [isSinedIn,setIsSignedIn]=useState(false)

    const setDataForBook=(Moviedata)=>{
        setmovieBookData(Moviedata)
        setActiveScreen("Book")
    }
    const setScreenFunction=(data)=>{
        setActiveScreen(data)
    }
    const setIsSinedInFunction=()=>{
        setIsSignedIn(!isSinedIn)
    }
    
    const carouselData=[
        "Sign up Today and get 50% off on your First Booking.",
        "Free Pop Corn and Drink on your Firstever Booking.",
        "Go Premiere & Bask in $5 Bonus Bucks"
    ]
    switch(activeScreen){
        case "Home":
            console.log(isSinedIn)
            return(
                <div className='ScreenContainer' isSinedIn={isSinedIn}>
                    <AppBar dataFromAppBar={setScreenFunction}/>
                    <Carousel carouselData={carouselData}/>
                    <MoviesDisplay dataFromCard={setDataForBook}/>
                </div>
            );
        case "Book":
            return(
                <div className='ScreenContainer'>
                    <AppBar dataFromAppBar={setScreenFunction}/>
                    <Book data={movieBookData} dataFromAppBar={setScreenFunction}/>
                </div>
            );
        case "Signup":
            return(
                <div className=''>
                   <Signup setScreen={setScreenFunction} setSinedIn={setIsSinedInFunction}/>
                </div>
            );
        default:
            return(
                <div className='ScreenContainer'>
                <AppBar dataFromAppBar={setScreenFunction} isSinedIn={isSinedIn}/>
                <Carousel carouselData={carouselData}/>
                <AppBarOptionsDescription activeScreen={activeScreen} dataFromAppBar={setScreenFunction}/>
                <MoviesDisplay dataFromCard={setDataForBook}/>
                </div>
            );
    }
}
