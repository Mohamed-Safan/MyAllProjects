
import { Component, OnInit } from '@angular/core';
import {MatTableDataSource} from '@angular/material/table';

export interface PeriodicElement {
  played: number;
  clubname: string;
  wins: number;
  lost: number;
  draw:number;
  points:number;
  gs:number;
  gr:number;
  gd:number;

}



const ELEMENT_DATA: PeriodicElement[] = [
  {clubname: "ds", played: 9, wins: 1, lost: 5, draw:1,points:3, gs:2, gr:1, gd:2},
  {clubname: "gh",  played: 5, wins: 4, lost: 3, draw:5,points:3,gs:3, gr:5, gd:4},
  {clubname: "gdr", played: 8, wins: 6, lost: 2, draw:7,points:3, gs:3, gr:2, gd:1},
  {clubname: "dfsg", played: 1, wins: 9, lost: 2, draw:2,points:3, gs:6 , gr:4, gd:3},
  {clubname: "sfg", played: 4, wins: 10, lost: 5, draw:1,points:3, gs:12, gr:2, gd:3},
  {clubname: "dfdg", played: 7, wins: 12, lost: 4, draw:3,points:3, gs:13, gr:14, gd:0},
  {clubname: "sgds", played: 2, wins: 14, lost: 5, draw:7,points:3, gs:25, gr:7, gd:2},
  {clubname: "sdfd", played: 15, wins: 15, lost: 8, draw:2,points:3, gs:17, gr:14, gd:-4},
  {clubname: "fgd", played: 14, wins: 18, lost: 7, draw:7, points:3,gs:32, gr:41, gd:3},
  {clubname: "gtrh", played: 12, wins: 20, lost: 4, draw:7,points:3, gs:3, gr:2, gd:9},
];



@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {
  displayedColumns: string[] = ['clubname', 'played', 'wins', 'lost','draw','gs','gr','gd'];
  dataSource = new MatTableDataSource(ELEMENT_DATA);



  applyFilter(event: Event) {
    const filterValue = (event.target as HTMLInputElement).value;
    this.dataSource.filter = filterValue.trim().toLowerCase();
  }

  constructor() { }

  ngOnInit(): void {
  }

}



