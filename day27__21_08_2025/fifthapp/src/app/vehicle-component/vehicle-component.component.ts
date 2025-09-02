import { Component, OnInit } from '@angular/core';
import { Vehicle } from '../vehicle';
import { VehicleService } from '../vehicle.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-vehicle-component',
  imports: [CommonModule],
  templateUrl: './vehicle-component.component.html',
  styleUrl: './vehicle-component.component.css'
})
export class VehicleComponentComponent implements OnInit{
vehicles: Vehicle[] = [];

  constructor(private vehicleService: VehicleService) {}

  ngOnInit(): void {
    this.vehicleService.getVehicles().subscribe(data => {
      this.vehicles = data;
    });
  }

}
