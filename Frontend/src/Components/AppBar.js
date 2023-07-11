import React from "react";
import "../CSS/AppBar.css";
import logo from "./../logos/logo.png";
import Movies from "./MoviesSearch";

export default function AppBar({dataFromAppBar}){
    const ImageMouseOverEvent =(e)=>{
        e.target.style.cursor = 'pointer';
    }
    return(
       <div>
        <div className="AppBarBox">
            <img src={logo} alt={logo} className="logoStyle" onClick={()=>{dataFromAppBar("Home")}} onMouseOver={ImageMouseOverEvent} />
            <Movies dataFromMovies={dataFromAppBar}/>
        </div>
       </div>
    );
}