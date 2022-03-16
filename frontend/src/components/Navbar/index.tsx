import { ReactComponent as GitHubIcon } from "assecs/img/github.svg";
import "./style.css"

function Navbar() {
    return (
        <header>
            <nav className="container">
                <div className="dsmovie-nav-content">
                    <h1><a href="https://github.com/jeff-felip/">JFMovie</a></h1>
                    <a href="https://github.com/jeff-felip/">
                        <div className="dsmovie-contact-container">
                            <GitHubIcon />
                            <p className="dsmovie-contact-link">/JEFF-FELIP</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>
    );
}
export default Navbar;