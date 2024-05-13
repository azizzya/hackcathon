import instance from '@/shared/api/axios.api';
import {
	ITamagotchi,
	ITamagotchiRequest,
} from '@/shared/interfaces/tamagotchi.interfaces';

class TamagotchiService {
	async updateTamagotchi(id: number, newTamagotchi: ITamagotchiRequest) {
		return instance.patch<ITamagotchi>(`tamagothies/${id}`, newTamagotchi);
	}
	//возможно возвращаемые типы поменяются потом
}

export const tamagotchiService = new TamagotchiService();
