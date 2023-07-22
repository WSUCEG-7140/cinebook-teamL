import React from "react";
import "../CSS/AppBar.css";
import logo from "./../logos/logo.png";
import Movies from "./MoviesSearch";

export default function AppBar({dataFromAppBar}){
    const ImageMouseOverEvent =(e)=>{
        e.target.style.cursor = 'pointer';
    }
    const handleLoginAction=(e)=>{
        fetch("http://localhost:8080/login")
    }
    return(
       <div>
        <div className="AppBarBox">
            <img src={logo} alt={logo} className="logoStyle" onClick={()=>{dataFromAppBar("Home")}} onMouseOver={ImageMouseOverEvent} />
            <Movies dataFromMovies={dataFromAppBar}/>
           <button onClick={handleLoginAction}>login</button>
        </div>
       </div>
    );
}
