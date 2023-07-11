import React, { useEffect, useState } from "react";
import Card from './Card'
import "./../CSS/MoviesDisplay.css"

export default function MoviesDisplay() {
    const [trendingMoviesData, setTendingMovieData] = useState([])
    const [comingMoviesData, setComingMovieData] = useState([])

    const fetchData = async () => {
        const response=await fetch('http://localhost:8080/movies/getByStatus?status=TRENDING');
        const json=await response.json();
        setTendingMovieData(json)
        const response2=await fetch('http://localhost:8080/movies/getByStatus?status=COMMING_SOON');
        const json2=await response2.json();
        setComingMovieData(json2)
    }
    
    useEffect(() => {
        fetchData()
      }, [])
    return (
        <div>
            <div class="MovieDisplayHeaderContainer">
                <h1>Trending Movies</h1>
            </div>
            <div class="MovieDisplayContainer">
                {trendingMoviesData.slice(0,10).map((d) => (
                    <Card data={d} />
                ))}
                <p className="h4style">See More</p>
            </div>
            <div class="MovieDisplayHeaderContainer">
                <h1>Coming Soon</h1>
            </div>
            <div class="MovieDisplayContainer">
                {
                comingMoviesData.slice(0,10).map((d) => (
                    <Card data={d} />
                ))}
            </div>
        </div>
    );
}