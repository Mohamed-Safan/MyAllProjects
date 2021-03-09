import { Component, OnInit } from '@angular/core';

export interface PeriodicElement {

  clubname:String;
  played:number;
  wins: number;
  lost: number;
  draw: number;
  points: number;
  gs: number;
  gr:number;
  gd:number;

}


const ELEMENT_DATA: PeriodicElement[] = [
  {clubname: "thomas",played:4, wins: 3, lost: 1, draw: 0, points:9,gs:15,gr:0,gd:15},
  {clubname: "royal",played:4, wins: 2, lost: 2, draw: 0, points:6,gs:12,gr:7,gd:5},
  {clubname: "nanames",played:4, wins: 4, lost: 0, draw: 0, points:6,gs:8,gr:1,gd:7},
  {clubname: "brigate",played:4, wins: 1, lost: 3, draw: 0,points:3,gs:2,gr:4,gd:-2},

];


@Component({
  selector: 'app-goalscored',
  templateUrl: './goalscored.component.html',
  styleUrls: ['./goalscored.component.css']
})
export class GoalscoredComponent implements OnInit {
  displayedColumns: string[] = ['clubname','played' ,'wins', 'lost', 'draw','points','gs','gr','gd'];
  dataSource = ELEMENT_DATA;




  constructor() { }

  ngOnInit(): void {
  }

}

