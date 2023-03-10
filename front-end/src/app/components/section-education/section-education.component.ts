import { Component } from '@angular/core';

@Component({
  selector: 'app-section-education',
  templateUrl: './section-education.component.html',
  styleUrls: ['./section-education.component.css']
})
export class SectionEducationComponent {
  certification = "TITULO DE TECNICA EN PROGRAMACION";
  certificationYear = 2022;
  institution =  "EES Tecnica N°3 Nikola Tesla";
  location = "Necochea";
}
