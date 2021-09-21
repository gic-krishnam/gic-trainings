import { Component, OnInit } from '@angular/core';
@Component({
  selector: 'app-company',
  templateUrl: './company.component.html',
  styleUrls: ['./company.component.css']
})
export class CompanyComponent implements OnInit {
  localItem: string | null;
  Training: never[];
  constructor() { 
  this.localItem = localStorage.getItem("company");
  if(this.localItem == null){
  this.Training = [];
  }
  else{ 
    this.Training = JSON.parse(this.localItem); 
  }

 }
  ngOnInit(): void {
  }

}
