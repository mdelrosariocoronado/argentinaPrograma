import { Component } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent {
  linkGithub = "https://github.com/mdelrosariocoronado?tab=repositories";
  linkLinkedIn= "https://www.linkedin.com/in/maria-del-rosario-coronado-29a667239/";
  linkInstagram= "https://www.instagram.com/rocoronado03/?next=%2F";
  linkFacebook= "https://es-la.facebook.com/";

}
