import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { MetaModule } from '../../services/meta.module';

@Component({
  selector: 'app-buchfuehrung',
  standalone: true,
  imports: [MetaModule],
  templateUrl: './buchfuehrung.component.html',
  styleUrl: './buchfuehrung.component.css'
})
export class BuchfuehrungComponent {

  constructor(private router: Router) {}

  navigateTo(path: string){
    this.router.navigate([path])
  };

}
