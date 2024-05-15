import { create } from 'zustand';
import { devtools } from 'zustand/middleware';
import { IStoreSearchState } from '../interfaces/storeSearch.interface';

export const useStoreSearchStore = create<IStoreSearchState>()(
	devtools(
		set => ({
			search: '',
			setSearch: search => set({ search }),
		}),
		{ name: 'StoreSearchStore' }
	)
);
