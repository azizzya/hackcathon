export interface ITamagotchi {
	id: number;
	happiness: number;
	health: number;
	satiety: number;
	motivation: number;
}

export interface ITamagotchiRequest extends Omit<ITamagotchi, 'id'> {}
