import React, { useState } from "react";
import "../CSS/Book.css"

export default function Book(props){
    const [price,setPrice]=useState(1)
    return(
        <div className="mainContainer">
            

            <img src={props.data.posterUrl}/>
            <h4>Theater: {props.theater}</h4>
            <h4>Movie : {props.data.title}</h4>
            <label>Choose number of tickets:</label>
            <div style={{display:"flex",flexDirection:"row"}}>
                <button style={{margin:"10px",width:"50px"}} onClick={()=>{setPrice(price+1)}}>+</button>
                <h6>{price}</h6>
                <button style={{margin:"10px",width:"50px"}} onClick={()=>{price>1?setPrice(price-1):setPrice(1)}}>-</button>
            </div>
            <div>
                <h3>Total Price : ${17.99*price}</h3>
            </div>
            <button onClick={()=>{alert("Your ticket is Conformed.");props.dataFromAppBar("Home")}}>Conform Booking.</button>
        </div>
    );
}