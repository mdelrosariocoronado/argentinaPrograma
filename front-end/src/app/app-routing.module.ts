import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

// Components
import { HomeComponent } from './components/home/home.component'
import { LogInComponent } from './components/log-in/log-in.component';

const routes: Routes = [
    { path: 'home', component: HomeComponent},
    { path: 'logIn', component: LogInComponent},
    { path: '**', component: HomeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
