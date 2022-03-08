import {ReactComponent as StarFull} from "assecs/img/StarFull.svg";
import {ReactComponent as StarHalf} from "assecs/img/StarHalf.svg";
import {ReactComponent as StarEmpty} from "assecs/img/StarEmpty.svg";
import "./style.css";


function MovieStar() {

    return (
        <div className="dsmovie-stars-container">
            <StarFull />
            <StarFull />
            <StarFull />
            <StarHalf />
            <StarEmpty />
        </div>
    );
}

export default MovieStar;