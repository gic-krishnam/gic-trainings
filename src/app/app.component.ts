import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'training';
  constructor(){
    setTimeout(() => {
      this.title=" Krishnam ";
    }, 2000);
  }
}
