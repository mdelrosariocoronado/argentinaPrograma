import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SectionBannerComponent } from './components/section-banner/section-banner.component';
import { HeaderComponent } from './components/header/header.component';
import { SectionInfoComponent } from './components/section-info/section-info.component';
import { SectionEducationComponent } from './components/section-education/section-education.component';
import { SectionExperienceComponent } from './components/section-experience/section-experience.component';
import { SectionProjectsComponent } from './components/section-projects/section-projects.component';
import { SectionSkillsComponent } from './components/section-skills/section-skills.component';

@NgModule({
  declarations: [
    AppComponent,
    SectionBannerComponent,
    HeaderComponent,
    SectionInfoComponent,
    SectionEducationComponent,
    SectionExperienceComponent,
    SectionProjectsComponent,
    SectionSkillsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
