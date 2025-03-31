import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  template: `
    <h1>Welcome to the Gym App!</h1>
    <p>Explore our workouts and members.</p>
    <a routerLink="/workouts">View Workouts</a> | <a routerLink="/members">View Members</a> | <a routerLink="/auth">Login/Register</a>
  `
})
export class HomeComponent { }
