import { storeService } from '@/shared/api/store.service';
import { useQuery } from '@tanstack/react-query';

export function useProducts() {
	return useQuery({
		queryFn: () => storeService.getall(),
		queryKey: ['products'],
	});
}
