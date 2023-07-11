import React from 'react';
import "./../CSS/AppBarOptionsDescriptions.css"
import DynamicList from './DynamicList';

export default function AppBarOptionsDescription({activeScreen,dataFromAppBar}){
    const TempData = {
        "Movies": ["The Flash", "Spider-Man: Across The Spider-Verse", "Elemental", "No Hard Feelings", "Transformers: Rise of the Beasts", "The Little Mermaid"],
        "Theatre": ["Albany,Georgia", " Tifton,Georgia"],
        "Food": ["PopCorn", " Drinks","Pizza"]
      }
    return(
        <div className='AppBarOptionsDescriptionContainer'>
            <DynamicList items={TempData[activeScreen]} dataFromAppBar={dataFromAppBar}/>
        </div>
    );
}