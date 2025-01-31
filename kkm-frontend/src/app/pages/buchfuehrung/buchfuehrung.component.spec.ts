import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BuchfuehrungComponent } from './buchfuehrung.component';

describe('BuchfuehrungComponent', () => {
  let component: BuchfuehrungComponent;
  let fixture: ComponentFixture<BuchfuehrungComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [BuchfuehrungComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(BuchfuehrungComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
